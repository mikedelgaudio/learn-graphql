const WebSocket = require("ws");

const wss = new WebSocket.Server({ port: 8082 });
// wss is actual server
wss.on("connection", (ws) => {
  // ws is a single connection
  console.log("new client " + ws);

  ws.on("message", (data) => {
    console.log(`Client sent ${data}`);
    ws.send(data.toUpperCase());
  });

  ws.on("close", () => {
    console.log("Client disconnected");
  });
});
