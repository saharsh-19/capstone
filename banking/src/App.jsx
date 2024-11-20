import { BrowserRouter, Route, Routes } from "react-router-dom"
import Layout from "./layout"
import Home from "./components/home"
import SignIn from "./components/signIn"
import LogIn from "./components/logIn"

const App = () => {
   return (
      <BrowserRouter>
         <Routes>
            <Route path="/" element={<Layout />}>
               <Route index element={<Home />} />
            </Route>
            <Route path="/sign-in" element={<SignIn />} />
            <Route path="/log-in" element={<LogIn />} />
         </Routes>
      </BrowserRouter>
   )
}

export default App
