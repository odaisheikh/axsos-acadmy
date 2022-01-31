class BanckAccount:
    def __init__(self):
        self.account_balance = 0
    def make_deposit(self,amount):
        self.account_balance +=amount
    def withdraw(self,amount):
        if amount>self.account_balance-5:
            print("Insufficient funds")
        else:
            self.account_balance =self.account_balance-amount-5
    def display_account_info(self):
        print(self.account_balance)
    def interest_yeld(self):
        if self.account_balance>0:
            self.account_balance +=self.account_balance*.01
samar =BanckAccount()
ali =BanckAccount()
samar.make_deposit(100)
samar.make_deposit(100)
samar.make_deposit(100)
samar.interest_yeld()
samar.withdraw(150)
samar.display_account_info()
