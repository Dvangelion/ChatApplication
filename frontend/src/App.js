import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Profile from "./profile/Profile";
import Signin from "./signin/Signin";
import Signup from "./signup/Signup"
import Chat from "./chat/Chat";
import "./App.css";

export const AppContext = React.createContext();
const App = (props) => {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route
            exact
            path="/login"
            render={(props) => <Signin {...props} />}
          />
          <Route
            exact
            path="/signup"
            render={(props) => <Signup {...props} />}
          />
          <Route exact path="/chat" render={(props) => <Chat {...props} />} />
        </Switch>
      </BrowserRouter>
    </div>
  );
};

export default App;