const form = document.querySelector('form')

form.addEventListener('submit', (event) => {
    //NOTE - anula o submit
    event.preventDefault();

    //REVIEW - declaração de variavel
    let name = document.querySelector('#name').value;
    let surname = document.querySelector('#surname').value;
    alert(name +" "+surname);
    form.reset()
})