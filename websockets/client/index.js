const ws = new WebSocket("ws://localhost:8082");
// use wss in a product type setting for security
ws.addEventListener("open", () => {
  console.log("CLIENT HAS CONNECTED");

  ws.send("Hey, I am from the client!");
});

ws.addEventListener("message", (e) => {
  console.log(e + " shello");
});
