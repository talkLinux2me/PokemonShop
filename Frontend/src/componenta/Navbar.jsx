import React from 'react'

function Navbar() {
  return (
   <>
   <nav>
   <div className="mx-auto max-w-7xl px-2 sm:px-6 lg:px-8 border">
        <div className="relative flex h-16 items-center justify-between">
          <div className="absolute inset-y-0 left-0 flex items-center sm:hidden">
          <span className="absolute -inset-0.5" />
          <span className="sr-only">Open main menu</span>
          </div>
        </div>
    </div>
   </nav>
   </>

  )

}  

export default Navbar;