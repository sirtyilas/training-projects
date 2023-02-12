import ExpenseItems from "./components/Expenses/ExpenseItems";
import CreateExpense from './components/CreateExpense/CreateExpense'
const App=()=>{
  
  return (
    <div>
      
      <CreateExpense></CreateExpense>
      <ExpenseItems></ExpenseItems>  
    </div>
  );
}

export default App;
