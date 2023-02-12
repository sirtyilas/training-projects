import ExpenseForm from "./ExpenseForm";
import './CreateExpense.css';

const CreateExpense = () => {
  return (
    <div className="new-expense">
      <ExpenseForm></ExpenseForm>
    </div>
  );
};

export default CreateExpense