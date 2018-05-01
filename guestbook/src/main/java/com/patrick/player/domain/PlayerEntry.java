package com.patrick.player.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table (name = "entries")
public class PlayerEntry {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "entry_id")
    public Integer id;

    public static String toString(int i, int i1) {
        return Integer.toString(i, i1);
    }

    public static String toUnsignedString(int i, int i1) {
        return Integer.toUnsignedString(i, i1);
    }

    public static String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static String toOctalString(int i) {
        return Integer.toOctalString(i);
    }

    public static String toBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    public static String toString(int i) {
        return Integer.toString(i);
    }

    public static String toUnsignedString(int i) {
        return Integer.toUnsignedString(i);
    }

    public static int parseInt(String s, int i) throws NumberFormatException {
        return Integer.parseInt(s, i);
    }

    public static int parseInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static int parseUnsignedInt(String s, int i) throws NumberFormatException {
        return Integer.parseUnsignedInt(s, i);
    }

    public static int parseUnsignedInt(String s) throws NumberFormatException {
        return Integer.parseUnsignedInt(s);
    }

    public static Integer valueOf(String s, int i) throws NumberFormatException {
        return Integer.valueOf(s, i);
    }

    public static Integer valueOf(String s) throws NumberFormatException {
        return Integer.valueOf(s);
    }

    public static Integer valueOf(int i) {
        return Integer.valueOf(i);
    }

    public byte byteValue() {
        return id.byteValue();
    }

    public short shortValue() {
        return id.shortValue();
    }

    public int intValue() {
        return id.intValue();
    }

    public long longValue() {
        return id.longValue();
    }

    public float floatValue() {
        return id.floatValue();
    }

    public double doubleValue() {
        return id.doubleValue();
    }

    public static int hashCode(int i) {
        return Integer.hashCode(i);
    }

    public static Integer getInteger(String s) {
        return Integer.getInteger(s);
    }

    public static Integer getInteger(String s, int i) {
        return Integer.getInteger(s, i);
    }

    public static Integer getInteger(String s, Integer integer) {
        return Integer.getInteger(s, integer);
    }

    public static Integer decode(String s) throws NumberFormatException {
        return Integer.decode(s);
    }

    public int compareTo(Integer integer) {
        return id.compareTo(integer);
    }

    public static int compare(int i, int i1) {
        return Integer.compare(i, i1);
    }

    public static int compareUnsigned(int i, int i1) {
        return Integer.compareUnsigned(i, i1);
    }

    public static long toUnsignedLong(int i) {
        return Integer.toUnsignedLong(i);
    }

    public static int divideUnsigned(int i, int i1) {
        return Integer.divideUnsigned(i, i1);
    }

    public static int remainderUnsigned(int i, int i1) {
        return Integer.remainderUnsigned(i, i1);
    }

    public static int highestOneBit(int i) {
        return Integer.highestOneBit(i);
    }

    public static int lowestOneBit(int i) {
        return Integer.lowestOneBit(i);
    }

    public static int numberOfLeadingZeros(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    public static int numberOfTrailingZeros(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    public static int bitCount(int i) {
        return Integer.bitCount(i);
    }

    public static int rotateLeft(int i, int i1) {
        return Integer.rotateLeft(i, i1);
    }

    public static int rotateRight(int i, int i1) {
        return Integer.rotateRight(i, i1);
    }

    public static int reverse(int i) {
        return Integer.reverse(i);
    }

    public static int signum(int i) {
        return Integer.signum(i);
    }

    public static int reverseBytes(int i) {
        return Integer.reverseBytes(i);
    }

    public static int sum(int i, int i1) {
        return Integer.sum(i, i1);
    }

    public static int max(int i, int i1) {
        return Integer.max(i, i1);
    }

    public static int min(int i, int i1) {
        return Integer.min(i, i1);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @NotEmpty
    public String user;
    @NotEmpty
    public String comment;}
