package com.ariellisf.coffeeshop.ui.products

class ProductsData {
    companion object {
        fun getProductList(): List<Product> {
            return listOf(
                Product(
                    "Expresso Tradicional",
                    "O tradicional café feito com água quente e grãos moídos",
                    "R$ 9,90",
                    "expresso"
                ),
                Product(
                    "Expresso Americano",
                    "Expresso diluído, menos intenso que o tradicional",
                    "R$ 9,90",
                    "americano"
                ),
                Product(
                    "Expresso Cremoso",
                    "Café expresso tradicional com espuma cremosa",
                    "R$ 9,90",
                    "expresso_cremoso"
                ),
                Product(
                    "Café com Leite",
                    "Meio a meio de expresso tradicional com leite vaporizado",
                    "R$ 9,90",
                    "cafe_com_leite"
                ),
                Product(
                    "Latte",
                    "Uma dose de café expresso com o dobro de leite e espuma cremosa",
                    "R$ 9,90",
                    "latte"
                ),
                Product(
                    "Capuccino",
                    "Bebida com canela feita de doses iguais de café, leite e espuma",
                    "R$ 9,90",
                    "capuccino"
                ),
                Product(
                    "Macchiato",
                    "Café expresso misturado com um pouco de leite quente e espuma",
                    "R$ 9,90",
                    "macchiato"
                ),
                Product(
                    "Mocaccino",
                    "Café expresso com calda de chocolate, pouco leite e espuma",
                    "R$ 9,90",
                    "mocaccino"
                ),
                Product(
                    "Chocolate Quente",
                    "Bebida feita com chocolate dissolvido no leite quente e café",
                    "R$ 9,90",
                    "chocolate_quente"
                ),
                Product(
                    "Cubano",
                    "Drink gelado de café expresso com rum, creme de leite e hortelã",
                    "R$ 9,90",
                    "cubano"
                ),
                Product(
                    "Havaiano",
                    "Bebida adocicada preparada com café e leite de coco",
                    "R$ 9,90",
                    "havaiano"
                ),
                Product(
                    "Árabe",
                    "Bebida preparada com grãos de café árabe e especiarias",
                    "R$ 9,90",
                    "arabe"
                ),
                Product(
                    "Irlandês",
                    "Bebida a base de café, uísque irlandês, açúcar e chantilly",
                    "R$ 9,90",
                    "irlandes"
                ),
            )
        }
    }
}