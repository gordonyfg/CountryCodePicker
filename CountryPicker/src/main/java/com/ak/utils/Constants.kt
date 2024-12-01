package com.ak.utils
import com.ak.countrypicker.R
import com.ak.model.CountryItem
import com.ak.utils.Constants.list

object Constants {
    var list = ArrayList<CountryItem>()
}

fun setCountryList() {
    if(!list.isEmpty())
        return
    list.add(
        CountryItem(
            "ad",
            "376",
            "Andorra",
            R.drawable.flag_andorra
        )
    )
    list.add(
        CountryItem(
            "ae",
            "971",
            "United Arab Emirates (UAE)",
            R.drawable.flag_uae
        )
    )
    list.add(
        CountryItem(
            "af",
            "93",
            "Afghanistan",
            R.drawable.flag_afghanistan
        )
    )
    list.add(
        CountryItem(
            "ag",
            "1",
            "Antigua and Barbuda",
            R.drawable.flag_antigua_and_barbuda
        )
    )
    list.add(
        CountryItem(
            "ai",
            "1",
            "Anguilla",
            R.drawable.flag_anguilla
        )
    )
    list.add(
        CountryItem(
            "al",
            "355",
            "Albania",
            R.drawable.flag_albania
        )
    )
    list.add(
        CountryItem(
            "am",
            "374",
            "Armenia",
            R.drawable.flag_armenia
        )
    )
    list.add(
        CountryItem(
            "ao",
            "244",
            "Angola",
            R.drawable.flag_angola
        )
    )
    list.add(
        CountryItem(
            "aq",
            "672",
            "Antarctica",
            R.drawable.flag_antarctica
        )
    )
    list.add(
        CountryItem(
            "ar",
            "54",
            "Argentina",
            R.drawable.flag_argentina
        )
    )
    list.add(
        CountryItem(
            "as",
            "1",
            "American Samoa",
            R.drawable.flag_american_samoa
        )
    )
    list.add(
        CountryItem(
            "at",
            "43",
            "Austria",
            R.drawable.flag_austria
        )
    )
    list.add(
        CountryItem(
            "au",
            "61",
            "Australia",
            R.drawable.flag_australia
        )
    )
    list.add(
        CountryItem(
            "aw",
            "297",
            "Aruba",
            R.drawable.flag_aruba
        )
    )
    list.add(
        CountryItem(
            "ax",
            "358",
            "Åland Islands",
            R.drawable.flag_aland
        )
    )
    list.add(
        CountryItem(
            "az",
            "994",
            "Azerbaijan",
            R.drawable.flag_azerbaijan
        )
    )
    list.add(
        CountryItem(
            "ba",
            "387",
            "Bosnia And Herzegovina",
            R.drawable.flag_bosnia
        )
    )
    list.add(
        CountryItem(
            "bb",
            "1",
            "Barbados",
            R.drawable.flag_barbados
        )
    )
    list.add(
        CountryItem(
            "bd",
            "880",
            "Bangladesh",
            R.drawable.flag_bangladesh
        )
    )
    list.add(
        CountryItem(
            "be",
            "32",
            "Belgium",
            R.drawable.flag_belgium
        )
    )
    list.add(
        CountryItem(
            "bf",
            "226",
            "Burkina Faso",
            R.drawable.flag_burkina_faso
        )
    )
    list.add(
        CountryItem(
            "bg",
            "359",
            "Bulgaria",
            R.drawable.flag_bulgaria
        )
    )
    list.add(
        CountryItem(
            "bh",
            "973",
            "Bahrain",
            R.drawable.flag_bahrain
        )
    )
    list.add(
        CountryItem(
            "bi",
            "257",
            "Burundi",
            R.drawable.flag_burundi
        )
    )
    list.add(
        CountryItem(
            "bj",
            "229",
            "Benin",
            R.drawable.flag_benin
        )
    )
    list.add(
        CountryItem(
            "bl",
            "590",
            "Saint Barthélemy",
            R.drawable.flag_saint_barthelemy
        )
    )
    list.add(
        CountryItem(
            "bm",
            "1",
            "Bermuda",
            R.drawable.flag_bermuda
        )
    )
    list.add(
        CountryItem(
            "bn",
            "673",
            "Brunei Darussalam",
            R.drawable.flag_brunei
        )
    )
    list.add(
        CountryItem(
            "bo",
            "591",
            "Bolivia, Plurinational State Of",
            R.drawable.flag_bolivia
        )
    )
    list.add(
        CountryItem(
            "br",
            "55",
            "Brazil",
            R.drawable.flag_brazil
        )
    )
    list.add(
        CountryItem(
            "bs",
            "1",
            "Bahamas",
             R.drawable.flag_bahamas
        )
    )
    list.add(
        CountryItem(
            "bt",
            "975",
            "Bhutan",
             R.drawable.flag_bhutan
        )
    )
    list.add(
        CountryItem(
            "bw",
            "267",
            "Botswana",
             R.drawable.flag_botswana
        )
    )
    list.add(
        CountryItem(
            "by",
            "375",
            "Belarus",
             R.drawable.flag_belarus
        )
    )
    list.add(
        CountryItem(
            "bz",
            "501",
            "Belize",
             R.drawable.flag_belize
        )
    )
    list.add(
        CountryItem(
            "ca",
            "1",
            "Canada",
             R.drawable.flag_canada
        )
    )
    list.add(
        CountryItem(
            "cc",
            "61",
            "Cocos (keeling) Islands",
             R.drawable.flag_cocos
        )
    )
    list.add(
        CountryItem(
            "cd",
            "243",
            "Congo, The Democratic Republic Of The",
             R.drawable.flag_democratic_republic_of_the_congo
        )
    )
    list.add(
        CountryItem(
            "cf",
            "236",
            "Central African Republic",
             R.drawable.flag_central_african_republic
        )
    )
    list.add(
        CountryItem(
            "cg",
            "242",
            "Congo",
             R.drawable.flag_republic_of_the_congo
        )
    )
    list.add(
        CountryItem(
            "ch",
            "41",
            "Switzerland",
             R.drawable.flag_switzerland
        )
    )
    list.add(
        CountryItem(
            "ci",
            "225",
            "Côte D'ivoire",
             R.drawable.flag_cote_divoire
        )
    )
    list.add(
        CountryItem(
            "ck",
            "682",
            "Cook Islands",
             R.drawable.flag_cook_islands
        )
    )
    list.add(
        CountryItem(
            "cl",
            "56",
            "Chile",
             R.drawable.flag_chile
        )
    )
    list.add(
        CountryItem(
            "cm",
            "237",
            "Cameroon",
             R.drawable.flag_cameroon
        )
    )
    list.add(
        CountryItem(
            "cn",
            "86",
            "China",
             R.drawable.flag_china
        )
    )
    list.add(
        CountryItem(
            "co",
            "57",
            "Colombia",
             R.drawable.flag_colombia
        )
    )
    list.add(
        CountryItem(
            "cr",
            "506",
            "Costa Rica",
             R.drawable.flag_costa_rica
        )
    )
    list.add(
        CountryItem(
            "cu",
            "53",
            "Cuba",
             R.drawable.flag_cuba
        )
    )
    list.add(
        CountryItem(
            "cv",
            "238",
            "Cape Verde",
             R.drawable.flag_cape_verde
        )
    )
    list.add(
        CountryItem(
            "cw",
            "599",
            "Curaçao",
             R.drawable.flag_curacao
        )
    )
    list.add(
        CountryItem(
            "cx",
            "61",
            "Christmas Island",
             R.drawable.flag_christmas_island
        )
    )
    list.add(
        CountryItem(
            "cy",
            "357",
            "Cyprus",
             R.drawable.flag_cyprus
        )
    )
    list.add(
        CountryItem(
            "cz",
            "420",
            "Czech Republic",
             R.drawable.flag_czech_republic
        )
    )
    list.add(
        CountryItem(
            "de",
            "49",
            "Germany",
             R.drawable.flag_germany
        )
    )
    list.add(
        CountryItem(
            "dj",
            "253",
            "Djibouti",
             R.drawable.flag_djibouti
        )
    )
    list.add(
        CountryItem(
            "dk",
            "45",
            "Denmark",
             R.drawable.flag_denmark
        )
    )
    list.add(
        CountryItem(
            "dm",
            "1",
            "Dominica",
             R.drawable.flag_dominica
        )
    )
    list.add(
        CountryItem(
            "do",
            "1",
            "Dominican Republic",
             R.drawable.flag_dominican_republic
        )
    )
    list.add(
        CountryItem(
            "dz",
            "213",
            "Algeria",
             R.drawable.flag_algeria
        )
    )
    list.add(
        CountryItem(
            "ec",
            "593",
            "Ecuador",
             R.drawable.flag_ecuador
        )
    )
    list.add(
        CountryItem(
            "ee",
            "372",
            "Estonia",
             R.drawable.flag_estonia
        )
    )
    list.add(
        CountryItem(
            "eg",
            "20",
            "Egypt",
             R.drawable.flag_egypt
        )
    )
    list.add(
        CountryItem(
            "er",
            "291",
            "Eritrea",
             R.drawable.flag_eritrea
        )
    )
    list.add(
        CountryItem(
            "es",
            "34",
            "Spain",
             R.drawable.flag_spain
        )
    )
    list.add(
        CountryItem(
            "et",
            "251",
            "Ethiopia",
             R.drawable.flag_ethiopia
        )
    )
    list.add(
        CountryItem(
            "fi",
            "358",
            "Finland",
             R.drawable.flag_finland
        )
    )
    list.add(
        CountryItem(
            "fj",
            "679",
            "Fiji",
             R.drawable.flag_fiji
        )
    )
    list.add(
        CountryItem(
            "fk",
            "500",
            "Falkland Islands (malvinas)",
             R.drawable.flag_falkland_islands
        )
    )
    list.add(
        CountryItem(
            "fm",
            "691",
            "Micronesia, Federated States Of",
             R.drawable.flag_micronesia
        )
    )
    list.add(
        CountryItem(
            "fo",
            "298",
            "Faroe Islands",
             R.drawable.flag_faroe_islands
        )
    )
    list.add(
        CountryItem(
            "fr",
            "33",
            "France",
             R.drawable.flag_france
        )
    )
    list.add(
        CountryItem(
            "ga",
            "241",
            "Gabon",
             R.drawable.flag_gabon
        )
    )
    list.add(
        CountryItem(
            "gb",
            "44",
            "United Kingdom",
             R.drawable.flag_united_kingdom
        )
    )
    list.add(
        CountryItem(
            "gd",
            "1",
            "Grenada",
             R.drawable.flag_grenada
        )
    )
    list.add(
        CountryItem(
            "ge",
            "995",
            "Georgia",
             R.drawable.flag_georgia
        )
    )
    list.add(
        CountryItem(
            "gf",
            "594",
            "French Guyana",
             R.drawable.flag_guyane
        )
    )
    list.add(
        CountryItem(
            "gh",
            "233",
            "Ghana",
             R.drawable.flag_ghana
        )
    )
    list.add(
        CountryItem(
            "gi",
            "350",
            "Gibraltar",
             R.drawable.flag_gibraltar
        )
    )
    list.add(
        CountryItem(
            "gl",
            "299",
            "Greenland",
             R.drawable.flag_greenland
        )
    )
    list.add(
        CountryItem(
            "gm",
            "220",
            "Gambia",
             R.drawable.flag_gambia
        )
    )
    list.add(
        CountryItem(
            "gn",
            "224",
            "Guinea",
             R.drawable.flag_guinea
        )
    )
    list.add(
        CountryItem(
            "gp",
            "450",
            "Guadeloupe",
             R.drawable.flag_guadeloupe
        )
    )
    list.add(
        CountryItem(
            "gq",
            "240",
            "Equatorial Guinea",
             R.drawable.flag_equatorial_guinea
        )
    )
    list.add(
        CountryItem(
            "gr",
            "30",
            "Greece",
             R.drawable.flag_greece
        )
    )
    list.add(
        CountryItem(
            "gt",
            "502",
            "Guatemala",
             R.drawable.flag_guatemala
        )
    )
    list.add(
        CountryItem(
            "gu",
            "1",
            "Guam",
             R.drawable.flag_guam
        )
    )
    list.add(
        CountryItem(
            "gw",
            "245",
            "Guinea-bissau",
             R.drawable.flag_guinea_bissau
        )
    )
    list.add(
        CountryItem(
            "gy",
            "592",
            "Guyana",
             R.drawable.flag_guyana
        )
    )
    list.add(
        CountryItem(
            "hk",
            "852",
            "Hong Kong",
             R.drawable.flag_hong_kong
        )
    )
    list.add(
        CountryItem(
            "hn",
            "504",
            "Honduras",
             R.drawable.flag_honduras
        )
    )
    list.add(
        CountryItem(
            "hr",
            "385",
            "Croatia",
             R.drawable.flag_croatia
        )
    )
    list.add(
        CountryItem(
            "ht",
            "509",
            "Haiti",
             R.drawable.flag_haiti
        )
    )
    list.add(
        CountryItem(
            "hu",
            "36",
            "Hungary",
             R.drawable.flag_hungary
        )
    )
    list.add(
        CountryItem(
            "id",
            "62",
            "Indonesia",
             R.drawable.flag_indonesia
        )
    )
    list.add(
        CountryItem(
            "ie",
            "353",
            "Ireland",
             R.drawable.flag_ireland
        )
    )
    list.add(
        CountryItem(
            "il",
            "972",
            "Israel",
             R.drawable.flag_israel
        )
    )
    list.add(
        CountryItem(
            "im",
            "44",
            "Isle Of Man",
             R.drawable.flag_isleof_man
        )
    )
    list.add(
        CountryItem(
            "is",
            "354",
            "Iceland",
             R.drawable.flag_iceland
        )
    )
    list.add(
        CountryItem(
            "in",
            "91",
            "India",
             R.drawable.flag_india
        )
    )
    list.add(
        CountryItem(
            "io",
            "246",
            "British Indian Ocean Territory",
             R.drawable.flag_british_indian_ocean_territory
        )
    )
    list.add(
        CountryItem(
            "iq",
            "964",
            "Iraq",
             R.drawable.flag_iraq_new
        )
    )
    list.add(
        CountryItem(
            "ir",
            "98",
            "Iran, Islamic Republic Of",
             R.drawable.flag_iran
        )
    )
    list.add(
        CountryItem(
            "it",
            "39",
            "Italy",
             R.drawable.flag_italy
        )
    )
    list.add(
        CountryItem(
            "je",
            "44",
            "Jersey ",
             R.drawable.flag_jersey
        )
    )
    list.add(
        CountryItem(
            "jm",
            "1",
            "Jamaica",
             R.drawable.flag_jamaica
        )
    )
    list.add(
        CountryItem(
            "jo",
            "962",
            "Jordan",
             R.drawable.flag_jordan
        )
    )
    list.add(
        CountryItem(
            "jp",
            "81",
            "Japan",
             R.drawable.flag_japan
        )
    )
    list.add(
        CountryItem(
            "ke",
            "254",
            "Kenya",
             R.drawable.flag_kenya
        )
    )
    list.add(
        CountryItem(
            "kg",
            "996",
            "Kyrgyzstan",
             R.drawable.flag_kyrgyzstan
        )
    )
    list.add(
        CountryItem(
            "kh",
            "855",
            "Cambodia",
             R.drawable.flag_cambodia
        )
    )
    list.add(
        CountryItem(
            "ki",
            "686",
            "Kiribati",
             R.drawable.flag_kiribati
        )
    )
    list.add(
        CountryItem(
            "km",
            "269",
            "Comoros",
             R.drawable.flag_comoros
        )
    )
    list.add(
        CountryItem(
            "kn",
            "1",
            "Saint Kitts and Nevis",
             R.drawable.flag_saint_kitts_and_nevis
        )
    )
    list.add(
        CountryItem(
            "kp",
            "850",
            "North Korea",
             R.drawable.flag_north_korea
        )
    )
    list.add(
        CountryItem(
            "kr",
            "82",
            "South Korea",
             R.drawable.flag_south_korea
        )
    )
    list.add(
        CountryItem(
            "kw",
            "965",
            "Kuwait",
             R.drawable.flag_kuwait
        )
    )
    list.add(
        CountryItem(
            "ky",
            "1",
            "Cayman Islands",
             R.drawable.flag_cayman_islands
        )
    )
    list.add(
        CountryItem(
            "kz",
            "7",
            "Kazakhstan",
             R.drawable.flag_kazakhstan
        )
    )
    list.add(
        CountryItem(
            "la",
            "856",
            "Lao People's Democratic Republic",
             R.drawable.flag_laos
        )
    )
    list.add(
        CountryItem(
            "lb",
            "961",
            "Lebanon",
             R.drawable.flag_lebanon
        )
    )
    list.add(
        CountryItem(
            "lc",
            "1",
            "Saint Lucia",
             R.drawable.flag_saint_lucia
        )
    )
    list.add(
        CountryItem(
            "li",
            "423",
            "Liechtenstein",
             R.drawable.flag_liechtenstein
        )
    )
    list.add(
        CountryItem(
            "lk",
            "94",
            "Sri Lanka",
             R.drawable.flag_sri_lanka
        )
    )
    list.add(
        CountryItem(
            "lr",
            "231",
            "Liberia",
             R.drawable.flag_liberia
        )
    )
    list.add(
        CountryItem(
            "ls",
            "266",
            "Lesotho",
             R.drawable.flag_lesotho
        )
    )
    list.add(
        CountryItem(
            "lt",
            "370",
            "Lithuania",
             R.drawable.flag_lithuania
        )
    )
    list.add(
        CountryItem(
            "lu",
            "352",
            "Luxembourg",
             R.drawable.flag_luxembourg
        )
    )
    list.add(
        CountryItem(
            "lv",
            "371",
            "Latvia",
             R.drawable.flag_latvia
        )
    )
    list.add(
        CountryItem(
            "ly",
            "218",
            "Libya",
             R.drawable.flag_libya
        )
    )
    list.add(
        CountryItem(
            "ma",
            "212",
            "Morocco",
             R.drawable.flag_morocco
        )
    )
    list.add(
        CountryItem(
            "mc",
            "377",
            "Monaco",
             R.drawable.flag_monaco
        )
    )
    list.add(
        CountryItem(
            "md",
            "373",
            "Moldova, Republic Of",
             R.drawable.flag_moldova
        )
    )
    list.add(
        CountryItem(
            "me",
            "382",
            "Montenegro",
             R.drawable.flag_of_montenegro
        )
    )
    list.add(
        CountryItem(
            "mf",
            "590",
            "Saint Martin",
             R.drawable.flag_saint_martin
        )
    )
    list.add(
        CountryItem(
            "mg",
            "261",
            "Madagascar",
             R.drawable.flag_madagascar
        )
    )
    list.add(
        CountryItem(
            "mh",
            "692",
            "Marshall Islands",
             R.drawable.flag_marshall_islands
        )
    )
    list.add(
        CountryItem(
            "mk",
            "389",
            "Macedonia (FYROM)",
             R.drawable.flag_macedonia
        )
    )
    list.add(
        CountryItem(
            "ml",
            "223",
            "Mali",
             R.drawable.flag_mali
        )
    )
    list.add(
        CountryItem(
            "mm",
            "95",
            "Myanmar",
             R.drawable.flag_myanmar
        )
    )
    list.add(
        CountryItem(
            "mn",
            "976",
            "Mongolia",
             R.drawable.flag_mongolia
        )
    )
    list.add(
        CountryItem(
            "mo",
            "853",
            "Macao",
             R.drawable.flag_macao
        )
    )
    list.add(
        CountryItem(
            "mp",
            "1",
            "Northern Mariana Islands",
             R.drawable.flag_northern_mariana_islands
        )
    )
    list.add(
        CountryItem(
            "mq",
            "596",
            "Martinique",
             R.drawable.flag_martinique
        )
    )
    list.add(
        CountryItem(
            "mr",
            "222",
            "Mauritania",
             R.drawable.flag_mauritania
        )
    )
    list.add(
        CountryItem(
            "ms",
            "1",
            "Montserrat",
             R.drawable.flag_montserrat
        )
    )
    list.add(
        CountryItem(
            "mt",
            "356",
            "Malta",
             R.drawable.flag_malta
        )
    )
    list.add(
        CountryItem(
            "mu",
            "230",
            "Mauritius",
             R.drawable.flag_mauritius
        )
    )
    list.add(
        CountryItem(
            "mv",
            "960",
            "Maldives",
             R.drawable.flag_maldives
        )
    )
    list.add(
        CountryItem(
            "mw",
            "265",
            "Malawi",
             R.drawable.flag_malawi
        )
    )
    list.add(
        CountryItem(
            "mx",
            "52",
            "Mexico",
             R.drawable.flag_mexico
        )
    )
    list.add(
        CountryItem(
            "my",
            "60",
            "Malaysia",
             R.drawable.flag_malaysia
        )
    )
    list.add(
        CountryItem(
            "mz",
            "258",
            "Mozambique",
             R.drawable.flag_mozambique
        )
    )
    list.add(
        CountryItem(
            "na",
            "264",
            "Namibia",
             R.drawable.flag_namibia
        )
    )
    list.add(
        CountryItem(
            "nc",
            "687",
            "New Caledonia",
             R.drawable.flag_new_caledonia
        )
    )
    list.add(
        CountryItem(
            "ne",
            "227",
            "Niger",
             R.drawable.flag_niger
        )
    )
    list.add(
        CountryItem(
            "nf",
            "672",
            "Norfolk Islands",
             R.drawable.flag_norfolk_island
        )
    )
    list.add(
        CountryItem(
            "ng",
            "234",
            "Nigeria",
             R.drawable.flag_nigeria
        )
    )
    list.add(
        CountryItem(
            "ni",
            "505",
            "Nicaragua",
             R.drawable.flag_nicaragua
        )
    )
    list.add(
        CountryItem(
            "nl",
            "31",
            "Netherlands",
             R.drawable.flag_netherlands
        )
    )
    list.add(
        CountryItem(
            "no",
            "47",
            "Norway",
             R.drawable.flag_norway
        )
    )
    list.add(
        CountryItem(
            "np",
            "977",
            "Nepal",
             R.drawable.flag_nepal
        )
    )
    list.add(
        CountryItem(
            "nr",
            "674",
            "Nauru",
             R.drawable.flag_nauru
        )
    )
    list.add(
        CountryItem(
            "nu",
            "683",
            "Niue",
             R.drawable.flag_niue
        )
    )
    list.add(
        CountryItem(
            "nz",
            "64",
            "New Zealand",
             R.drawable.flag_new_zealand
        )
    )
    list.add(
        CountryItem(
            "om",
            "968",
            "Oman",
             R.drawable.flag_oman
        )
    )
    list.add(
        CountryItem(
            "pa",
            "507",
            "Panama",
             R.drawable.flag_panama
        )
    )
    list.add(
        CountryItem(
            "pe",
            "51",
            "Peru",
             R.drawable.flag_peru
        )
    )
    list.add(
        CountryItem(
            "pf",
            "689",
            "French Polynesia",
             R.drawable.flag_french_polynesia
        )
    )
    list.add(
        CountryItem(
            "pg",
            "675",
            "Papua New Guinea",
             R.drawable.flag_papua_new_guinea
        )
    )
    list.add(
        CountryItem(
            "ph",
            "63",
            "Philippines",
             R.drawable.flag_philippines
        )
    )
    list.add(
        CountryItem(
            "pk",
            "92",
            "Pakistan",
             R.drawable.flag_pakistan
        )
    )
    list.add(
        CountryItem(
            "pl",
            "48",
            "Poland",
             R.drawable.flag_poland
        )
    )
    list.add(
        CountryItem(
            "pm",
            "508",
            "Saint Pierre And Miquelon",
             R.drawable.flag_saint_pierre
        )
    )
    list.add(
        CountryItem(
            "pn",
            "870",
            "Pitcairn Islands",
             R.drawable.flag_pitcairn_islands
        )
    )
    list.add(
        CountryItem(
            "pr",
            "1",
            "Puerto Rico",
             R.drawable.flag_puerto_rico
        )
    )
    list.add(
        CountryItem(
            "ps",
            "970",
            "Palestine",
             R.drawable.flag_palestine
        )
    )
    list.add(
        CountryItem(
            "pt",
            "351",
            "Portugal",
             R.drawable.flag_portugal
        )
    )
    list.add(
        CountryItem(
            "pw",
            "680",
            "Palau",
             R.drawable.flag_palau
        )
    )
    list.add(
        CountryItem(
            "py",
            "595",
            "Paraguay",
             R.drawable.flag_paraguay
        )
    )
    list.add(
        CountryItem(
            "qa",
            "974",
            "Qatar",
             R.drawable.flag_qatar
        )
    )
    list.add(
        CountryItem(
            "re",
            "262",
            "Réunion",
             R.drawable.flag_transparent //no flag
        )
    )
    list.add(
        CountryItem(
            "ro",
            "40",
            "Romania",
             R.drawable.flag_romania
        )
    )
    list.add(
        CountryItem(
            "rs",
            "381",
            "Serbia",
             R.drawable.flag_serbia
        )
    )
    list.add(
        CountryItem(
            "ru",
            "7",
            "Russian Federation",
             R.drawable.flag_russian_federation
        )
    )
    list.add(
        CountryItem(
            "rw",
            "250",
            "Rwanda",
             R.drawable.flag_rwanda
        )
    )
    list.add(
        CountryItem(
            "sa",
            "966",
            "Saudi Arabia",
             R.drawable.flag_saudi_arabia
        )
    )
    list.add(
        CountryItem(
            "sb",
            "677",
            "Solomon Islands",
             R.drawable.flag_soloman_islands
        )
    )
    list.add(
        CountryItem(
            "sc",
            "248",
            "Seychelles",
             R.drawable.flag_seychelles
        )
    )
    list.add(
        CountryItem(
            "sd",
            "249",
            "Sudan",
             R.drawable.flag_sudan
        )
    )
    list.add(
        CountryItem(
            "se",
            "46",
            "Sweden",
             R.drawable.flag_sweden
        )
    )
    list.add(
        CountryItem(
            "sg",
            "65",
            "Singapore",
             R.drawable.flag_singapore
        )
    )
    list.add(
        CountryItem(
            "sh",
            "290",
            "Saint Helena, Ascension And Tristan Da Cunha",
             R.drawable.flag_saint_helena
        )
    )
    list.add(
        CountryItem(
            "si",
            "386",
            "Slovenia",
             R.drawable.flag_slovenia
        )
    )
    list.add(
        CountryItem(
            "sk",
            "421",
            "Slovakia",
             R.drawable.flag_slovakia
        )
    )
    list.add(
        CountryItem(
            "sl",
            "232",
            "Sierra Leone",
             R.drawable.flag_sierra_leone
        )
    )
    list.add(
        CountryItem(
            "sm",
            "378",
            "San Marino",
             R.drawable.flag_san_marino
        )
    )
    list.add(
        CountryItem(
            "sn",
            "221",
            "Senegal",
             R.drawable.flag_senegal
        )
    )
    list.add(
        CountryItem(
            "so",
            "252",
            "Somalia",
             R.drawable.flag_somalia
        )
    )
    list.add(
        CountryItem(
            "sr",
            "597",
            "Suriname",
             R.drawable.flag_suriname
        )
    )
    list.add(
        CountryItem(
            "ss",
            "211",
            "South Sudan",
             R.drawable.flag_south_sudan
        )
    )
    list.add(
        CountryItem(
            "st",
            "239",
            "Sao Tome And Principe",
             R.drawable.flag_sao_tome_and_principe
        )
    )
    list.add(
        CountryItem(
            "sv",
            "503",
            "El Salvador",
             R.drawable.flag_el_salvador
        )
    )
    list.add(
        CountryItem(
            "sx",
            "1",
            "Sint Maarten",
             R.drawable.flag_sint_maarten
        )
    )
    list.add(
        CountryItem(
            "sy",
            "963",
            "Syrian Arab Republic",
             R.drawable.flag_syria
        )
    )
    list.add(
        CountryItem(
            "sz",
            "268",
            "Swaziland",
             R.drawable.flag_swaziland
        )
    )
    list.add(
        CountryItem(
            "tc",
            "1",
            "Turks and Caicos Islands",
             R.drawable.flag_turks_and_caicos_islands
        )
    )
    list.add(
        CountryItem(
            "td",
            "235",
            "Chad",
             R.drawable.flag_chad
        )
    )
    list.add(
        CountryItem(
            "tg",
            "228",
            "Togo",
             R.drawable.flag_togo
        )
    )
    list.add(
        CountryItem(
            "th",
            "66",
            "Thailand",
             R.drawable.flag_thailand
        )
    )
    list.add(
        CountryItem(
            "tj",
            "992",
            "Tajikistan",
             R.drawable.flag_tajikistan
        )
    )
    list.add(
        CountryItem(
            "tk",
            "690",
            "Tokelau",
             R.drawable.flag_tokelau
        )
    )
    list.add(
        CountryItem(
            "tl",
            "670",
            "Timor-leste",
             R.drawable.flag_timor_leste
        )
    )
    list.add(
        CountryItem(
            "tm",
            "993",
            "Turkmenistan",
             R.drawable.flag_turkmenistan
        )
    )
    list.add(
        CountryItem(
            "tn",
            "216",
            "Tunisia",
             R.drawable.flag_tunisia
        )
    )
    list.add(
        CountryItem(
            "to",
            "676",
            "Tonga",
             R.drawable.flag_tonga
        )
    )
    list.add(
        CountryItem(
            "tr",
            "90",
            "Turkey",
             R.drawable.flag_turkey
        )
    )
    list.add(
        CountryItem(
            "tt",
            "1",
            "Trinidad &amp; Tobago",
             R.drawable.flag_trinidad_and_tobago
        )
    )
    list.add(
        CountryItem(
            "tv",
            "688",
            "Tuvalu",
             R.drawable.flag_tuvalu
        )
    )
    list.add(
        CountryItem(
            "tw",
            "886",
            "Taiwan",
             R.drawable.flag_taiwan
        )
    )
    list.add(
        CountryItem(
            "tz",
            "255",
            "Tanzania, United Republic Of",
             R.drawable.flag_tanzania
        )
    )
    list.add(
        CountryItem(
            "ua",
            "380",
            "Ukraine",
             R.drawable.flag_ukraine
        )
    )
    list.add(
        CountryItem(
            "ug",
            "256",
            "Uganda",
             R.drawable.flag_uganda
        )
    )
    list.add(
        CountryItem(
            "us",
            "1",
            "United States",
             R.drawable.flag_united_states_of_america
        )
    )
    list.add(
        CountryItem(
            "uy",
            "598",
            "Uruguay",
             R.drawable.flag_uruguay
        )
    )
    list.add(
        CountryItem(
            "uz",
            "998",
            "Uzbekistan",
             R.drawable.flag_uzbekistan
        )
    )
    list.add(
        CountryItem(
            "va",
            "379",
            "Holy See (vatican City State)",
             R.drawable.flag_vatican_city
        )
    )
    list.add(
        CountryItem(
            "vc",
            "1",
            "Saint Vincent &amp; The Grenadines",
             R.drawable.flag_saint_vicent_and_the_grenadines
        )
    )
    list.add(
        CountryItem(
            "ve",
            "58",
            "Venezuela, Bolivarian Republic Of",
             R.drawable.flag_venezuela
        )
    )
    list.add(
        CountryItem(
            "vg",
            "1",
            "British Virgin Islands",
             R.drawable.flag_british_virgin_islands
        )
    )
    list.add(
        CountryItem(
            "vi",
            "1",
            "US Virgin Islands",
             R.drawable.flag_us_virgin_islands
        )
    )
    list.add(
        CountryItem(
            "vn",
            "84",
            "Vietnam",
             R.drawable.flag_vietnam
        )
    )
    list.add(
        CountryItem(
            "vu",
            "678",
            "Vanuatu",
             R.drawable.flag_vanuatu
        )
    )
    list.add(
        CountryItem(
            "wf",
            "681",
            "Wallis And Futuna",
             R.drawable.flag_wallis_and_futuna
        )
    )
    list.add(
        CountryItem(
            "ws",
            "685",
            "Samoa",
             R.drawable.flag_samoa
        )
    )
    list.add(
        CountryItem(
            "xk",
            "383",
            "Kosovo",
             R.drawable.flag_kosovo
        )
    )
    list.add(
        CountryItem(
            "ye",
            "967",
            "Yemen",
             R.drawable.flag_yemen
        )
    )
    list.add(
        CountryItem(
            "yt",
            "262",
            "Mayotte",
             R.drawable.flag_transparent //no flag
        )
    )
    list.add(
        CountryItem(
            "za",
            "27",
            "South Africa",
             R.drawable.flag_south_africa
        )
    )
    list.add(
        CountryItem(
            "zm",
            "260",
            "Zambia",
             R.drawable.flag_zambia
        )
    )
    list.add(
        CountryItem(
            "zw",
            "263",
            "Zimbabwe",
             R.drawable.flag_zimbabwe
        )
    )
}

