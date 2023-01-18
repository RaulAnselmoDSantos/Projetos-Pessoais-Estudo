const timer = document.querySelector("#timer");
const startStop = document.querySelector("#start-stop");
const timePassed = document.querySelector("#time-passed");
let intervalId;
let seconds = 0;

startStop.addEventListener("click", () => {
  if (startStop.textContent === "Iniciar") {
    intervalId = setInterval(() => {
      seconds++;
      timer.textContent = seconds;
      timePassed.textContent = `Tempo passado: ${Math.floor(seconds / 3600)} horas, ${Math.floor(seconds / 60) % 60} minutos, ${seconds % 60} segundos.`;
    }, 1000);
    startStop.textContent = "Parar";
  } else {
    clearInterval(intervalId);
    startStop.textContent = "Iniciar";
  }
});
