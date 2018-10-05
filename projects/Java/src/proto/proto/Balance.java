// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package proto;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;

public class Balance implements Comparable<Object>
{
    public String currency = "";
    public double amount = (double)0.0d;

    public Balance() {}

    public Balance(String currency, double amount)
    {
        this.currency = currency;
        this.amount = amount;
    }

    public Balance(Balance other)
    {
        this.currency = other.currency;
        this.amount = other.amount;
    }

    public Balance clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new proto.fbe.BalanceModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new proto.fbe.BalanceModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return -1;

        final Balance obj = (Balance)other;

        int result = 0;
        result = currency.compareTo(obj.currency);
        if (result != 0)
            return result;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return false;

        final Balance obj = (Balance)other;

        if (!currency.equals(obj.currency))
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + currency.hashCode();
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("Balance(");
        sb.append("currency="); if (currency != null) sb.append("\"").append(currency).append("\""); else sb.append("null");
        sb.append(",amount="); sb.append(amount);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return proto.fbe.Json.getJsonEngine().toJson(this); }
    public static Balance fromJson(String json) { return proto.fbe.Json.getJsonEngine().fromJson(json, Balance.class); }
}
