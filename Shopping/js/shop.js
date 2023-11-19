var obj = [
    { id: 1, Pname: "laptop", category: "laptop", subcategory: "hp", price: 30000, Pimage: "../images/l1.jpeg" },
    { id: 2, Pname: "laptop", category: "laptop", subcategory: "hp", price: 32000, Pimage: "../images/l2.png" },
    { id: 3, Pname: "laptop", category: "laptop", subcategory: "dell", price: 20000, Pimage: "../images/l3.jpeg" },
    { id: 4, Pname: "laptop", category: "laptop", subcategory: "dell", price: 25000, Pimage: "../images/l4.jpeg" },
    { id: 5, Pname: "laptop", category: "laptop", subcategory: "hp", price: 35000, Pimage: "../images/l5.jpeg" },

    { id: 6, Pname: "mobile", category: "mobile", subcategory: "nokia", price: 17000, Pimage: "../images/m1.jpeg" },
    { id: 7, Pname: "mobile", category: "mobile", subcategory: "nokia", price: 15000, Pimage: "../images/m2.jpeg" },
    { id: 8, Pname: "mobile", category: "mobile", subcategory: "samsung", price: 25000, Pimage: "../images/m3.jpeg" },
    { id: 9, Pname: "mobile", category: "mobile", subcategory: "samsung", price: 30000, Pimage: "../images/m4.jpeg" },
    { id: 10, Pname: "mobile", category: "mobile", subcategory: "samsung", price: 10000, Pimage: "../images/m5.jpeg" },
    { id: 11, Pname: "watch", category: "watch", price: 2000, Pimage: "../images/w1.jpeg" },

    { id: 12, Pname: "watch", category: "watch", price: 3000, Pimage: "../images/w2.jpeg" }

]

function filterData(cat) {
    fdata = obj.filter((pro) => {
        return cat === pro.category
    })
    var totaldata = fdata.map((item) => {
        return (`
            <div class="left col-3">
                <img src=${item.Pimage} height="150px">
                <div class="content">
                    <h2> Product-${item.Pname}   </h2>
                    <p>Price-Rs.${item.price} category=${item.category}  </p>
                    <p>SubCat=${item.subcategory}  </p>
                </div>
            </div>
        `)
    })
    document.getElementById("root").innerHTML = totaldata;
}


function laptopfilter(subcat) {
    var sbdata = fdata.filter((subpro) => {
        return subcat === subpro.subcategory
    })
    var totaldata = sbdata.map((item) => {
        return (`
            <div class="left col-3">
                <img src=${item.Pimage} height="150px">
                <div class="content">
                    <h2> Product-${item.Pname}   </h2>
                    <p>Price-Rs.${item.price} category=${item.category}  </p>
                    <p>SubCat=${item.subcategory}  </p>
                </div>
            </div>
        `)
    })
    document.getElementById("root").innerHTML = totaldata;
}


var totaldata = obj.map((item) => {
    return (`
        <div class="left col-3">
            <img src=${item.Pimage} height="150px">
            <div class="content">
                <h2> Product-${item.Pname}   </h2>
                <p>Price-Rs.${item.price} category=${item.category}  </p>
                <p>SubCat=${item.subcategory}  </p>
            </div>
    
        </div>
        
    `)
})
document.getElementById("root").innerHTML = totaldata;
