package program;

public class Account {
	

		private String type;
		private int id;
		private float balance;
		private static int numberAccounts;
		private Holder holder;
		
		public Account (int ID,String TYPE, Holder holderData)
		{
			numberAccounts =+ 1;
			
			id = ID;
			type = TYPE;
			
			
			
			
			System.out.println(numberAccounts);
			
		}
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public float getBalance() {
			return balance;
		}
		public float setBalance(float balance) {
			 return this.balance = balance;
		}
		
		
		
		public boolean withdraw (float valueWithdraw)
		{
			if(this.getBalance() >= valueWithdraw){
				
				setBalance( this.balance - valueWithdraw);
				return true;
				
			}
			return false;
			
		}
		
		public boolean deposit (float valueDeposit)
		{
			setBalance (this.balance + valueDeposit);
			return true;
		}
		
		public boolean transfer (float transferredAmount, Account destiny)
		{
			if(setBalance(this.balance) >= transferredAmount) {
				
				this.setBalance(this.balance - transferredAmount);
				destiny.setBalance(balance + transferredAmount);
				return true;
			
				
			}
			return false;
			
		}

		public Holder getHolder() {
			return holder;
		}

		public void setHolder(Holder holder) {
			this.holder = holder;
		}
		
		
		

	}



