import { Outlet, Navigate } from "react-router-dom"
import Header from "./components/header"
import { useLocalStorage } from "./hooks/useLocalStorage"

const Layout = () => {
   const [token] = useLocalStorage("jwtToken", null)

   if (!token) {
      console.log("token not found: ", token)
      return <Navigate to="/log-in" />
   }

   return (
      <div className="h-[100vh] w-[100vw] flex flex-col m-0 overflow-x-hidden">
         <Header />
         <div className="flex-grow h-[calc(100vh-65px)] bg-neutral-100 text-black ">
            <Outlet />
         </div>
      </div>
   )
}

export default Layout
