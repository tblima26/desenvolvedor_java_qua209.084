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



const botaoBuscar = document.querySelector("#buscar-cep");
const botaoSend = document.querySelector("#send");

function preencherEndereco(dados) {
  const safe = (v) => v ?? "";

  document.querySelector("#logradouro").value = safe(dados.logradouro);
  document.querySelector("#complemento").value = safe(dados.complemento);
  document.querySelector("#uf").value = safe(dados.uf);
  document.querySelector("#ddd").value = safe(dados.ddd);
}

botaoBuscar.addEventListener("click", async () => {
  const cepRegex = /^\d{5}-?\d{3}$/;
  const cep = document.querySelector("#cep").value.trim();
  if (!cepRegex.test(cep)) {
    alert("CEP inválido! Digite no formato 00000-000 ou 00000000");
    return;
  }
  const cepLimpo = cep.replace(/\D/g, "");
  try {
    const resposta = await fetch(`https://viacep.com.br/ws/${cepLimpo}/json/`);
    const dados = await resposta.json();
    if (dados.erro) {
      alert("CEP não encontrado");
      return;
    }
    preencherEndereco(dados); // 👈 callback aqui
  } catch (error) {
    alert("Erro ao buscar CEP");
    console.error(error);
  }
});

function renderizarJson() {
  const dados = {
  nome: document.querySelector("#nome").value,
  tel: document.querySelector("#tel").value,
  email: document.querySelector("#email").value,
  cpf: document.querySelector("#cpf").value,
  cep: document.querySelector("#cep").value,
  logradouro: document.querySelector("#logradouro").value,
  complemento: document.querySelector("#complemento").value,
  uf: document.querySelector("#uf").value,
  ddd: document.querySelector("#ddd").value
};
  console.log(dados);
  const container = document.querySelector("#resultado");

  container.innerHTML = `
    <div class="card-json">
      <h3>JSON Gerado</h3>
      <pre>${JSON.stringify(dados, null, 2)}</pre>
    </div>
  `;
}

botaoSend.addEventListener("click", (e) => {
  e.preventDefault();
  renderizarJson();
});