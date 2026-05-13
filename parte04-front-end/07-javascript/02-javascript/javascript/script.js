const form = document.querySelector('form');

const maiorIdade = () => {
    const nome = document.querySelector('#name').value
    const idade = document.querySelector('#age').value
    const result = idade >= 18 ? "Maior de idade." : "Menor de idade.";
    document.querySelector('#result').innerHTML = `<h2>${nome} - ${result}</h2>`;
    form.reset();
}

form.addEventListener('submit', (e) => {
    e.preventDefault();
    maiorIdade();
});