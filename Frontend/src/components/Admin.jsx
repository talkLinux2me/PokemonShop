

import React, { useState } from 'react'
import { Eye, EyeOff, Lock, Mail, User } from 'lucide-react'

function Admin() {
//   const [showPassword, setShowPassword] = useState(false)
//   const [email, setEmail] = useState('')
//   const [password, setPassword] = useState('')

//   const handleSubmit = (e) => {
//     e.preventDefault()
//     // Handle login logic here
//     console.log('Login attempt with:', { email, password })
//   }

//   return (
//     <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-indigo-500 to-purple-600 py-12 px-4 sm:px-6 lg:px-8">
//       <div className="max-w-md w-full space-y-8 bg-white p-10 rounded-xl shadow-2xl transform transition-all duration-300 hover:scale-105">
//         <div>
//           <div className="mx-auto h-12 w-12 bg-indigo-600 text-white rounded-full flex items-center justify-center transform transition-transform duration-300 hover:rotate-12">
//             <User className="h-6 w-6" />
//           </div>
//           <h2 className="mt-6 text-center text-3xl font-extrabold text-gray-900 transition-opacity duration-300 hover:opacity-80">
//             Admin Login
//           </h2>
//         </div>
//         <form className="mt-8 space-y-6" onSubmit={handleSubmit}>
//           <div className="rounded-md shadow-sm -space-y-px">
//             <div className="transition-all duration-300 hover:shadow-md">
//               <label htmlFor="email-address" className="sr-only">
//                 Email address
//               </label>
//               <div className="relative">
//                 <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
//                   <Mail className="h-5 w-5 text-gray-400" />
//                 </div>
//                 <input
//                   id="email-address"
//                   name="email"
//                   type="email"
//                   autoComplete="email"
//                   required
//                   className="appearance-none rounded-none relative block w-full px-3 py-2 pl-10 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm transition-all duration-300 hover:border-indigo-400"
//                   placeholder="Email address"
//                   value={email}
//                   onChange={(e) => setEmail(e.target.value)}
//                 />
//               </div>
//             </div>
//             <div className="transition-all duration-300 hover:shadow-md">
//               <label htmlFor="password" className="sr-only">
//                 Password
//               </label>
//               <div className="relative">
//                 <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
//                   <Lock className="h-5 w-5 text-gray-400" />
//                 </div>
//                 <input
//                   id="password"
//                   name="password"
//                   type={showPassword ? "text" : "password"}
//                   autoComplete="current-password"
//                   required
//                   className="appearance-none rounded-none relative block w-full px-3 py-2 pl-10 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-b-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm transition-all duration-300 hover:border-indigo-400"
//                   placeholder="Password"
//                   value={password}
//                   onChange={(e) => setPassword(e.target.value)}
//                 />
//                 <div className="absolute inset-y-0 right-0 pr-3  flex items-center" sx={{fontSize:"10px"}}>
//                   <button
//                     type="button"
//                     onClick={() => setShowPassword(!showPassword)}
//                     className="text-gray-400 hover:text-gray-500 focus:outline-none focus:text-gray-500 transition-colors duration-200"
//                   >
//                     {showPassword ? <EyeOff className="h-1 w-1" /> : <Eye className="h-1 w-1" />}
//                   </button>
//                 </div>
//               </div>
//             </div>
//           </div>

//           <div className="flex items-center justify-between">
//             <div className="flex items-center">
//               <input
//                 id="remember-me"
//                 name="remember-me"
//                 type="checkbox"
//                 className="h-4 w-4 text-indigo-200 focus:ring-indigo-500 border-gray-300 rounded transition-colors duration-200"
//               />
//               <label htmlFor="remember-me" className="ml-2 block text-sm text-gray-900">
//                 Remember me
//               </label>
//             </div>

//             <div className="text-sm">
//               <a href="#" className="font-medium text-indigo-600 hover:text-indigo-500 transition-colors duration-200">
//                 Forgot your password?
//               </a>
//             </div>
//           </div>

//           <div>
//             <button
//               type="submit"
//               className="group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500 transition-all duration-300 transform hover:scale-105"
//             >
//               Sign in
//             </button>
//           </div>
//         </form>

//         <p className="mt-2 text-center text-sm text-gray-600 transition-opacity duration-300 hover:opacity-80">
//           Not an admin?{' '}
//           <a href="#" className="font-medium text-indigo-600 hover:text-indigo-500 transition-colors duration-200">
//             Return to main site
//           </a>
//         </p>
//       </div>
//     </div>
//   )
// }

return (
    <div className="min-h-screen flex items-center justify-center bg-gray-100">
      <div className="max-w-md w-full bg-white shadow-md rounded p-8">
        <h2 className="text-2xl font-bold mb-4">Admin Login</h2>
        <form>
          <div className="mb-4">
            <label className="block text-gray-700 mb-2">Username</label>
            <input type="text" className="w-full px-4 py-2 border rounded" placeholder="Enter your username" />
          </div>
          <div className="mb-4">
            <label className="block text-gray-700 mb-2">Password</label>
            <input type="password" className="w-full px-4 py-2 border rounded" placeholder="Enter your password" />
          </div>
          <button type="submit" className="w-full px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600">Login</button>
          <p className="mt-2 text-center text-sm text-gray-600 transition-opacity duration-300 hover:opacity-80">
           Not an admin?{' '}
           <a href="#" className="font-medium text-indigo-600 hover:text-indigo-500 transition-colors duration-200">
             Return to main site
           </a>
         </p>
        </form>
      </div>
    </div>
  );
};


export default Admin