# 四、Switch & if 的比较

## 一、选择switch | if 的原则

1. #### <font color="blues">如果判断的具体数值不多,且符合 byte,char,short,int,enum(枚举法),String类型则建议用switch</font>.

2. #### <font color="blues">其它情况:比如 对某个区间的判断,对结果为boolean类型的判断, 就建议用if,  if 的使用范围更广泛</font>. 