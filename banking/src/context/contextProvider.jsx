import { useState } from "react"
import { BankingContext } from './context';


/* eslint react/prop-types: 0 */
const BankingContextProvider = ({ children }) => {
   const [user, setUser] = useState()
   return (
      <BankingContext.Provider value={{ user, setUser }}>
         {children}
      </BankingContext.Provider>
   )
}

export default BankingContextProvider
