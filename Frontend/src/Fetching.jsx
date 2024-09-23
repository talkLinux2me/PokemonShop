import { useState } from "react";

function Fetching() {
    const [data, setData] = useState(null);
    const randomNumber = Math.floor(Math.random() * 1025) + 1;
    const getData = async () => {
            try{
            const response = await fetch('https://api.pokemontcg.io/v2/cards/');
            const data = await response.json();
            // setData(data.data[randomNumber]);
            // let image = await data.data[randomNumber].images.small;
            console.log(data);
            
        } catch (error) {
            console.log(error);
        }
    }

    getData();
    return (
        <div>
            <h1>Fetching</h1>
            <p></p>
        </div>
  )
}

export default Fetching