import Carousel from "./Carousel";
import Multi1 from "../assets/Packs/MultiPacks.jpg"
import Multi2 from "../assets/Packs/MultiPack2.jpg"
import Multi3 from "../assets/Packs/MultiPack3.jpg"

const featuredCards = [
    { id: 1, name: "DEAL OF THE DAY", image: Multi1, Price: 15.99 },
    { id: 2, name: "DEAL OF THE MONTH", image:Multi2, Price: 15.99 },
    { id: 3, name: "DEAL OF THE YEAR", image: Multi3, Price: 15.99},
  ];
  

export const Home = () => {
    return (
        <div className="relative w-[1440px] h-[1024px] bg-[url(/asset/pokemon-bg-image.png)] bg-cover bg-center border border-black">
            <div className="absolute top-0 left-0 w-full h-[151px] bg-black">
                <div className="absolute top-[11px] left-[30px] text-[64px] font-normal text-transparent bg-clip-text bg-red-600 whitespace-nowrap">
                    POKEMON CARDS
                </div>
                <p className="absolute top-[6px] left-[1152px] text-[36px] font-normal text-[#fa1b1b] whitespace-nowrap">
                    SIGN UP / LOG IN
                </p>
                <div className="absolute top-[108px] left-[694px] text-[20px] font-normal text-white whitespace-nowrap">
                    CHOOSE TYPE
                </div>
                <div className="absolute top-[108px] left-[993px] text-[20px] font-normal text-white whitespace-nowrap">
                    CHOOSE PACK
                </div>
                <p className="absolute top-[61px] left-[1272px] text-[13px] font-normal text-transparent whitespace-nowrap">
                    <span className="text-[#ff0101]">0</span>
                    <span className="text-white"> ITEMS IN CART</span>
                </p>
                <div className="absolute top-[105px] left-[1215px] w-[206px] h-[32px] bg-[#d9d9d9] rounded-[11px]">
                    <div className="absolute top-[7px] left-[17px] text-[13px] font-normal text-black whitespace-nowrap">
                        SEARCH
                    </div>
                </div>
            </div>
            <div className="absolute top-[173px] left-[882px] w-[467px] h-[439px] ">
                
            </div>
            <div className="flex justify-center">
            <Carousel items={featuredCards}/>
            
            </div>
        </div>
    );
};