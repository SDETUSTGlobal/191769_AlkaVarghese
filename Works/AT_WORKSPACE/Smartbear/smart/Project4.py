from selenium import webdriver  
import time  
from selenium.webdriver.common.keys import Keys  
print("test case started")  

driver = webdriver.Chrome("E:\eclipse\chromedriver_win32\chromedriver.exe")
 
driver.maximize_window()  

driver.delete_all_cookies()  

driver.get("https://www.ajio.com/")  
 
driver.find_element_by_xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/div/input").send_keys("scraf")
time.sleep(2)

driver.find_element_by_xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/button/span").click()

#driver.find_element_by_xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/a/div/div[1]/img").click()
#time.sleep(2)

driver.get("https://www.ajio.com/fig-chevron-print-scarf-with-tasselled-border/p/441160011_pink")
#driver.find_element_by_xpath("//input[@name='radio-button 7']")
#radio5= driver.find_element_by_xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div[5]/div").click()

driver.find_element_by_xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]").click()
time.sleep(3)

driver.find_element_by_xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/div[2]/a/div").click()
time.sleep(2)
driver.find_element_by_xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/button")

print("added to cart")
driver.close()