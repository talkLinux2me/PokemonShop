import FetchData from '../FetchData'
import Navbar from './Navbar.jsx'

function Home() {
  return (
    <>
    <div className='bg-pink'>
    <p>Home page!</p>
    <Navbar />
    <FetchData />
    </div>
    </>
  )
}

export default Home