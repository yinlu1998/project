import unittest
from api2018 import Common
from api2018.Sendhttp import SendHttp

class qgTest(unittest.TestCase):
#已登录，有收货地址
    def test_scene4(self):
        login_url = "/common/fgadmin/login"
        address_url = "/fgadmin/address/list"
        submit_url = "/fgadmin/orders/submit"

        #登录
        user = {"phoneArea":"86","phoneNumber":"200000000055","password":"netease123"}
        login_result=SendHttp().send_post(login_url,user)
        print(login_result)

        #查询收货地址
        address_result=SendHttp().sent_get_bycookies(address_url,Common.getcookies(user))
        print(address_result)
        # 计算运费
        receiveName = address_result['result']['list'][0]['fgUser']['userName']
        province = address_result['result']['list'][0]['province']
        city = address_result['result']['list'][0]['city']
        area = address_result['result']['list'][0]['area']
        fee_url = "/common/getTransportFee?id=1&addressDetail=province+city+area"
        fee_result = SendHttp().sent_get(fee_url)
        print(fee_result)

        #提交
        sub_data={"skuIds":"2,3","skuNumbers":"1,1","stockIds":"74966312,74966313","receiverName":"李四","cellPhone":"20000000004"
                ,"addressDetail":"南京大学","province":"江苏省","city":"南京市","area":"鼓楼区","voiceStatus":0,"needInvoice":0,"invoiceHead"
                    :"","transportFee":0,"logisticsCompanyId":1,"accessSource":"noSource","accessDevice":0}
        sub_result=SendHttp().send_post_bycookies(submit_url,Common.getcookies(user),sub_data)
        print(sub_result)

if __name__ == '__main__':
    unittest.main()