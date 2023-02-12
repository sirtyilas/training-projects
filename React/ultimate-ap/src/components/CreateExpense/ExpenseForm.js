import './ExpenseForm.css'

const ExpenseForm = () => {
  return (
    <form>
      <div className="new-expense__controls">
        <div className="new-expense__control">
          <label className="new-expense__control">Title</label>
          <input type="text" />
        </div>
        <div className="new-expense__control">
          <label className="new-expense__control">Amount</label>
          <input type="number"  min='0.01' step='0.01'/>
        </div>
        <div className="new-expense__control">
          <label className="new-expense__control">Date</label>
          <input type="date" min='1999-01-01' max='2029-12-31'/>
        </div>
      </div>
			<div className="new-expense__actions">
				<button type="submit">Submit</button>
			</div>
    </form>
  );
};

export default ExpenseForm