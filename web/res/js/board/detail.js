let btnContainerElem = document.querySelector('#btnContainer');
let btnDelElem = btnContainerElem.querySelector('#btnDel');
let errmsgElem = document.querySelector('.msg');
function delBoard(){
    location.href='/board/del?iboard='+btnContainerElem.dataset.iboard;

}
console.log(errmsgElem.dataset.msg);
if (errmsgElem.dataset.msg){
    console.log('true');
    alert(`${errmsgElem.dataset.msg}`);
}

btnDelElem.addEventListener('click', function (e){
    if (confirm('삭제하시겠습니까?')){
       delBoard();
   }
});




