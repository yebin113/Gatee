import React from 'react';
import Router from "./Router";

const App = ()=> {
  // 로컬 스토리지 초기화
  // localStorage.removeItem("family");
  // localStorage.removeItem("member");

  return (
    <div>
      <Router/>
    </div>
  );
}

export default App;
