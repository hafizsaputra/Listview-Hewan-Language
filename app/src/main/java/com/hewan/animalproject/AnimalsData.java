package com.pandjiaprillian.animalproject;

import java.util.ArrayList;

public class AnimalsData {
    public static String[][] animalsData = new String[][]{
            {"Serigala", "Canis lupus","Serigala adalah binatang mamalia karnivora. Serigala abu-abu mempunyai asal usul yang sama dengan anjing luar negeri dari keluarga Canis lupus melalui bukti pengurutan DNA dan penyelidikan genetika. Beberapa jenis anjing juga memiliki bentuk fisik yang mirip dengan serigala, contohnya anjing jenis Siberian Husky, Malamut Alaska dan Samoyed. Secara umum, serigala mempunyai tinggi sekitar 60 cm sampai 80 cm (26-32 inci) dan berat sekitar 23–59 kilogram.", String.valueOf(R.drawable.wolf)},
            {"Harimau Putih", "Panthera tigris","Harimau putih adalah harimau yang membawa gen resesif yang menghasilkan pewarnaan pucatnya. Ada juga satu fitur genetik yang menyebabkan belangnya juga berwarna pudar. Ini terjadi bila seekor harimau mewarisi dua salinan gen resesif untuk pewarnaan pudar yang jarang terjadi. Harimau putih berhidung merah jambu, berpusat kaki merah jambu, berkulit kelam kelabu, bermata biru es, dan berbulu putih atau putih kuning berbelang hitam, kelabu atau coklat.", String.valueOf(R.drawable.white_tiger)},
            {"Leopard", "Panthera pardus", "Leopard atau Macan tutul adalah salah satu dari empat kucing besar. Hewan ini dikenal juga dengan sebutan harimau dahan karena kemampuannya memanjat. Pada mulanya, orang berpikiran bahwa macan tutul adalah hibrida dari singa dan harimau, sehingga muncul nama di kalangan peneliti Eropa awal.", String.valueOf(R.drawable.leopard)},
            {"Singa", "Panthera leo", "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya.", String.valueOf(R.drawable.lion)},
            {"Rubah", "Vulpes vulpes", "Rubah adalah karnivora kecil. Terdapat 27 spesies rubah, mereka adalah hewan omnivora dan anggota terkecil famili Canidae (mamalia yang berhubungan dengan anjing). Mereka adalah pelari cepat dan tangkas. Rubah dapat ditemui di semua benua, hidup di hutan, semak-semak dan padang pasir.", String.valueOf(R.drawable.fox)},
            {"Badak", "Rhinocerotidae", "Badak (Rhino) adalah lima spesies hewan dari famili Rhinocerotidae, ordo Perissodactyla yang kesemuanya berasal dari Afrika atau Asia.", String.valueOf(R.drawable.rhino)},
            {"Yak", "Bos grunniens", "Yak adalah sejenis sapi yang banyak ditemukan di Tibet dan wilayah sekitar Himalaya di Asia Tengah. Kata yak merujuk kepada spesies jantan sedangkan seekor betina disebut dri atau nak.", String.valueOf(R.drawable.yak)},
            {"Burung Merak", "Pavo muticus", "Merak biru atau Merak india, yang dalam nama ilmiahnya Pavo cristatus adalah salah satu burung dari tiga spesies burung merak. Merak biru mempunyai bulu berwarna biru gelap mengilap. Burung jantan dewasa berukuran besar, panjangnya dapat mencapai 230 cm, dengan penutup ekor yang sangat panjang berwarna hijau metalik. Di atas kepalanya terdapat jambul tegak biru membentuk kipas. Burung betina berukuran lebih kecil dari burung jantan. Bulu-bulunya tidak mengilap, berwarna coklat kehijauan dengan garis-garis hitam dan tanpa dihiasi bulu penutup ekor. Burung muda seperti betina.", String.valueOf(R.drawable.peacock)},
            {"Bunglon", "Bronchocela jubata", "Bunglon adalah sejenis kadal kecil yang biasa hidup di pohon. Bunglon adalah hewan yang eksotis dari kelas reptil (kadal). Tampilannya mirip hewan purba. Bentuk rupanya sangat mirip dengan kerabatnya yaitu kadal iguana. Bunglon juga salah satu reptil yang paling terkenal terutama di daerah penduduk asli benua Afrika dan Madagaskar, ditemukan di beberapa tempat lainnya di Eropa dan Asia. Ada lebih dari 120 spesies yang termasuk dalam keluarga bunglon. Yang paling umum bunglon (Chamaeleo) ditemukan di wilayah Mediterania.", String.valueOf(R.drawable.chameleon)},
            {"Penyu", "Chelonioidea","Penyu adalah kura-kura laut yang ditemukan di semua samudra di dunia. Menurut data para ilmuwan, penyu sudah ada sejak akhir zaman Jura (145 - 208 juta tahun yang lalu) atau seusia dengan dinosaurus.", String.valueOf(R.drawable.turtle)},
    };

    public static ArrayList<Animal> getListData(){
        ArrayList<Animal> list = new ArrayList<>();
        for (String[] arrayData : animalsData){
            Animal animal = new Animal();
            animal.setAnimalName(arrayData[0]);
            animal.setAnimalLatinName(arrayData[1]);
            animal.setAnimalDescription(arrayData[2]);
            animal.setAnimalPhoto(Integer.parseInt(arrayData[3]));

            list.add(animal);
        }
        return list;
    }
}
