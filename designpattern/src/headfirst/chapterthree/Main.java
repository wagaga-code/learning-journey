package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:为英雄带上一把火焰附魔的剑
 */
public class Main {


    public static void main(String[] args) {
        // 1. 创建最基础的剑
        Weapon sword = new Sword();

        // 2. 用火焰附魔包住它
        FireEnchantmentDecorator fireSword = new FireEnchantmentDecorator(sword);

        // 3. 这里，装饰者 fireSword 的 decoratedWeapon 属性
        //    指向了那把原始的 Sword 对象。
        System.out.println(fireSword.damage());        // 输出 15
        System.out.println(fireSword.getDescription());// 输出 “铁剑，燃烧着火焰”

        // 4. 如果要调用装饰者特有的方法，就用具体的装饰者引用
        System.out.println("火焰伤害值：" + fireSword.getFireDamage());  // 输出 5

    }




}