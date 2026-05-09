const form = document.querySelector('form');

const maskCpf = document.querySelector('#cpf');
const maskTel = document.querySelector('#tel');
const maskCep = document.querySelector('#cep');

const result = document.querySelector('#result');

/**
 * CPF
 */
maskCpf.addEventListener('input', function () {
  this.value = this.value
    .replace(/\D/g, '')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d{1,2})$/, '$1-$2');

});


/**
 * Telefone
 */
maskTel.addEventListener('input', function () {
  this.value = this.value
    .replace(/\D/g, '')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{5})(\d)/, '$1-$2');

});


/**
 * CEP
 */
maskCep.addEventListener('input', function () {
  this.value = this.value
    .replace(/\D/g, '')
    .replace(/(\d{5})(\d)/, '$1-$2');

});



form.addEventListener('submit', function (e) {

  e.preventDefault();
  const name = document.querySelector('#name').value;
  const cpf = document.querySelector('#cpf').value;
  const tel = document.querySelector('#tel').value;
  const cep = document.querySelector('#cep').value;
  console.log(name)

  result.innerHTML = `
    <div class="resultado">
      <p><strong>Nome:</strong> ${name}</p>
      <p><strong>CPF:</strong> ${cpf}</p>
      <p><strong>Telefone:</strong> ${tel}</p>
      <p><strong>CEP:</strong> ${cep}</p> 
    </div>
  `;

});