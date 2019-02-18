package com.xandersu.javainterview.imooc.class303.chapter2_network;

/**
 * @Author: suxun
 * @Date: 2019/2/17 22:30
 * @Description: 2-1 $_2_1_网络基础知识讲解
 * OSI开放式互联参考模型
 * OSI 7层协议
 * 第一层 物理层：
 * 原始比特流传输
 * --网线标准
 * 第二层 数据链路层：
 * --定义了如何格式化数据以数据传输 以及如何对物理介质访问 通常提供错误检测和纠正
 * --将byte数据组成帧；交换机工作在这一层，对帧解码，并根据帧中包含的信息把数据发送到接收方
 * 第三层：网络层
 * --点对点通信要经过多个节点，如何找到目标节点？如何选择最佳节点？
 * --主要功能：将网络地址翻译成对应的物理地址，并决定如何将数据从发送方路由到接收方
 * --路由器  数据包   IP协议
 * 第四层：传输层
 * --最重要的层
 * --TCP协议  UDP协议
 * 第五层：会话层
 * 第六层：表示层
 * 第七层：应用层
 * ===============
 * OSI的"实现"：TCP/IP
 * 先自上而下，后自下而上处理数据头部
 */
public class $_2_01_网络基础知识讲解 {
}
