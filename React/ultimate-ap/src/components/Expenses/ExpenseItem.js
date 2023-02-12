import ExpenseItemDate from "../Expenses/ExpenseItemDate";
import "./ExpenseItem.css";
import Card from '../UI/Card';
import { useState } from "react";

const ExpenseItem = (props)=>{

	// const itemExpenseDate = new Date(2020, 2, 23);
	// const itemDescription = 'Car Insurence';
	// const itemPrice = 234983
  const [title,setTitle] = useState(props.title)

  const onClickHandler = ()=>{
    setTitle('Books');
    console.log('State changed!');
  }



  return (
    <Card className='expense-item'>
      <ExpenseItemDate date={props.date} />
      <div className='expense-item__description'>
        <h2>{title}</h2>
        <div className='expense-item__price'>${props.amount}</div>
        <div><button onClick={onClickHandler}>Submit</button></div>
      </div>
    </Card>
  );
}

export default ExpenseItem;
