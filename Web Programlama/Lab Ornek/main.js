function MesajVer()
{
    alert("İlk Javascript Uygulaması");
    document.getElementById("div2").style.display = "block";
    console.log(document.getElementsByName("btnMesaj"));
    document.getElementsByName("btnMesaj")[0].value = "Mesaj Verildi";
    document.getElementsByName("btnMesaj")[0].disabled = "disabled";
}


function AdSoyadYazdir(){
    var ad = document.getElementsByClassName("input")[0].value;
    var soyad = document.getElementsByClassName("input")[1].value;
    alert("Ad: " + ad + "Soyad: " + soyad);
    document.getElementsByName("btnBilgi")[0].disabled = "disabled";
    document.getElementById("div3").style.display = "block";
}

function Renklendir(secim){

    var renkIndeks = secim.selectedIndex;
    var renk = secim.options[renkIndeks].text;
    console.log(renk);
    document.getElementById("renkText").innerHTML = "Seçilen Renk: " + renk;
    document.getElementById("renkText").style.color = renk;

    if(renk == "Black")
    {
        console.log("renk siyah")
        document.getElementById("div4").style.display = "block";
    }


}

function classDegistir(secim){
    console.log(secim);
    if(secim.value === "Dar"){
        document.getElementById("div4").className = "dar";
    }
    else if(secim.value === "Geniş"){
        document.getElementById("div4").setAttribute("class", "genis");
    }
    else{
        document.getElementById("div4").className = "normal";
        document.getElementById("div5").style.display = "block";
    }
}

var dersler = new Array();
function AddOrRemove(cb){
    console.log(cb);
    var ders = document.querySelector('label[for="' + cb.id + '"]').innerHTML;
    if(cb.checked)
    {
        dersler.push(ders);
    }else{
        dersIndex = dersler.indexOf(ders);
        dersler.splice(dersIndex,1);
    }
}

function DersYazdir()
{
    var DerslerText = "<ul> Seçilen Dersler";
    var i;
    for(i=0;i<dersler.length;i++)
    {
        DerslerText = DerslerText + "<li>" +dersler[i]+"</li>";
    }
    DerslerText = DerslerText+ "</ul>";
    document.getElementById("dersler").innerHTML = DerslerText;
    document.getElementById("div6").style.display = "block";

}


function Giris() {
    var kullaniciAdi = document.getElementById('txtKullaniciAdi').value;
    var btnGiris = document.getElementById('btnGiris');
    console.log(kullaniciAdi);
    if (kullaniciAdi === '' ) {
       if(btnGiris.style.left == "150px"){
        btnGiris.style.left = "10px"
       }
       else{
       btnGiris.style.left = "150px";
    }}
}



function girisYapildi()
{
    
}
