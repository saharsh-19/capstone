import { useEffect, useState } from "react"
import apiClient from "../interceptor"

// list all the users here
const Home = () => {
   const [users, setUsers] = useState([])

   const [loading, setLoading] = useState(false)

   const fetchData = async () => {
      setLoading(true)
      try {
         const resp = await apiClient("users/all")
         setUsers(resp.data)
      } catch (error) {
         console.log("Error fetching data: ", error)
      }
      setLoading(false)
   }

   useEffect(() => {
      fetchData()
   }, [])

   if (loading)
      return (
         <div className="h-[100%] w-[100%] flex justify-center items-center">
            <span className="loading loading-spinner loading-lg" />
         </div>
      )

   return (
      <div className="h-[100%] w-[100%] px-20 py-10 overflow-y-auto">
         <div className="overflow-x-hidden">
            <table className="table">
               <thead>
                  <tr className="text-blue-600 text-lg uppercase">
                     <th></th>
                     <th>User Id</th>
                     <th>Name</th>
                     <th>Email</th>
                  </tr>
               </thead>
               <tbody className="text-base">
                  {users.map.length>0 && users.map((user, index) => (
                     <tr
                        key={index}
                        className="cursor-pointer hover:bg-blue-600/[0.1]"
                     >
                        <td>{index + 1}.</td>
                        <td>{user.id}</td>
                        <td className="capitalize">{user.username}</td>
                        <td>{user.email}</td>
                     </tr>
                  ))}
               </tbody>
            </table>
         </div>
      </div>
   )
}

export default Home
