var dialog = document.querySelector('dialog');
document.querySelector('#openDialog').onclick = function() {
    dialog.show();
    alert("message");
}
document.querySelector('#closeDialog').onclick = function() {
    dialog.close();

}