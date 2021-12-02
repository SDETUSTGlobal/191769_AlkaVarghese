from selenium import webdriver  
import time  
from selenium.webdriver.common.keys import Keys  
print("test case started")  
 
driver = webdriver.Chrome("E:\eclipse\chromedriver_win32\chromedriver.exe")  
 
driver.maximize_window()  

driver.delete_all_cookies()  

driver.get("https://www.amazon.in/")  

driver.find_element_by_id("twotabsearchtextbox").send_keys("bags")  
time.sleep(2)

driver.find_element_by_id("nav-search-submit-button").click()
time.sleep(2)

#driver.find_element_by_xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img").click()
driver.get("https://www.amazon.in/American-Tourister-AMT-SCH-02/dp/B07CJCGM1M/ref=sr_1_3?keywords=bags&qid=1638117887&qsid=257-8903053-5103146&sr=8-3&sres=B07CJCGM1M%2CB085MHDJ93%2CB07PQQ8M7B%2CB074G3TJYF%2CB075Y72PHZ%2CB07J46KLFP%2CB07K8KLB3P%2CB07G3CG9FC%2CB07G4F6XFH%2CB07MCRHSVP%2CB084JGJ8PF%2CB08YZ5XY31%2CB08DLL3794%2CB07PFF4RYC%2CB0849PHNG1%2CB09CLQGPGJ&srpt=BACKPACK")
time.sleep(1)  

driver.find_element_by_id("add-to-cart-button").click()
time.sleep(2)

driver.find_element_by_xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/a[4]/div[2]/span[2]").click()
time.sleep(2)

#driver.find_element_by_id("proceedToRetailCheckout").click()
#time.sleep(2)
print("successfully added to cart")
 
driver.close()
