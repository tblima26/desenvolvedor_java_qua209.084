

const feed = document.querySelector('.feed');

const nicks = [
  "ghosty", "vibez", "darkman", "lunarx", "codezera",
  "chillboy", "astrozin", "ninj4", "pixelado", "fluxo",
];

const tags = [
  "#liveNow", "#gaming", "#music", "#randomTalks",
  "#coding", "#fun", "#streamLife",
];

function randomItem(arr) {
  return arr[Math.floor(Math.random() * arr.length)];
}

const users = Array.from({ length: 12}, () => ({
  nick: randomItem(nicks) + Math.floor(Math.random() * 100),
  tag: randomItem(tags)
}));

users.forEach((user, i) => {
  const views = Math.floor(Math.random() * 1000);

  const card = `
    <div class="card">
      <img class="cover" src="img/live/online-${i+1}.jpg" alt="live">
      <div class="card-info">
        <img class="avatar" src="img/profile/p${(i%6)+1}.jpg">
        <div class="user">
          <div class="nick">${user.nick}</div>
          <div class="tag">${user.tag}</div>
        </div>
        <div class="views">
          <i class="fa-solid fa-eye"></i> ${views}
        </div>
      </div>
    </div>
  `;
  feed.innerHTML += card;
});
