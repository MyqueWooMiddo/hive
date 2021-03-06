/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.ql.plan.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class Graph implements TBase<Graph, Graph._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Graph");

  private static final TField NODE_TYPE_FIELD_DESC = new TField("nodeType", TType.I32, (short)1);
  private static final TField ROOTS_FIELD_DESC = new TField("roots", TType.LIST, (short)2);
  private static final TField ADJACENCY_LIST_FIELD_DESC = new TField("adjacencyList", TType.LIST, (short)3);

  private NodeType nodeType;
  private List<String> roots;
  private List<Adjacency> adjacencyList;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * 
     * @see NodeType
     */
    NODE_TYPE((short)1, "nodeType"),
    ROOTS((short)2, "roots"),
    ADJACENCY_LIST((short)3, "adjacencyList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NODE_TYPE
          return NODE_TYPE;
        case 2: // ROOTS
          return ROOTS;
        case 3: // ADJACENCY_LIST
          return ADJACENCY_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_TYPE, new FieldMetaData("nodeType", TFieldRequirementType.DEFAULT, 
        new EnumMetaData(TType.ENUM, NodeType.class)));
    tmpMap.put(_Fields.ROOTS, new FieldMetaData("roots", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.ADJACENCY_LIST, new FieldMetaData("adjacencyList", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Adjacency.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Graph.class, metaDataMap);
  }

  public Graph() {
  }

  public Graph(
    NodeType nodeType,
    List<String> roots,
    List<Adjacency> adjacencyList)
  {
    this();
    this.nodeType = nodeType;
    this.roots = roots;
    this.adjacencyList = adjacencyList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Graph(Graph other) {
    if (other.isSetNodeType()) {
      this.nodeType = other.nodeType;
    }
    if (other.isSetRoots()) {
      List<String> __this__roots = new ArrayList<String>();
      for (String other_element : other.roots) {
        __this__roots.add(other_element);
      }
      this.roots = __this__roots;
    }
    if (other.isSetAdjacencyList()) {
      List<Adjacency> __this__adjacencyList = new ArrayList<Adjacency>();
      for (Adjacency other_element : other.adjacencyList) {
        __this__adjacencyList.add(new Adjacency(other_element));
      }
      this.adjacencyList = __this__adjacencyList;
    }
  }

  public Graph deepCopy() {
    return new Graph(this);
  }

  @Override
  public void clear() {
    this.nodeType = null;
    this.roots = null;
    this.adjacencyList = null;
  }

  /**
   * 
   * @see NodeType
   */
  public NodeType getNodeType() {
    return this.nodeType;
  }

  /**
   * 
   * @see NodeType
   */
  public void setNodeType(NodeType nodeType) {
    this.nodeType = nodeType;
  }

  public void unsetNodeType() {
    this.nodeType = null;
  }

  /** Returns true if field nodeType is set (has been asigned a value) and false otherwise */
  public boolean isSetNodeType() {
    return this.nodeType != null;
  }

  public void setNodeTypeIsSet(boolean value) {
    if (!value) {
      this.nodeType = null;
    }
  }

  public int getRootsSize() {
    return (this.roots == null) ? 0 : this.roots.size();
  }

  public java.util.Iterator<String> getRootsIterator() {
    return (this.roots == null) ? null : this.roots.iterator();
  }

  public void addToRoots(String elem) {
    if (this.roots == null) {
      this.roots = new ArrayList<String>();
    }
    this.roots.add(elem);
  }

  public List<String> getRoots() {
    return this.roots;
  }

  public void setRoots(List<String> roots) {
    this.roots = roots;
  }

  public void unsetRoots() {
    this.roots = null;
  }

  /** Returns true if field roots is set (has been asigned a value) and false otherwise */
  public boolean isSetRoots() {
    return this.roots != null;
  }

  public void setRootsIsSet(boolean value) {
    if (!value) {
      this.roots = null;
    }
  }

  public int getAdjacencyListSize() {
    return (this.adjacencyList == null) ? 0 : this.adjacencyList.size();
  }

  public java.util.Iterator<Adjacency> getAdjacencyListIterator() {
    return (this.adjacencyList == null) ? null : this.adjacencyList.iterator();
  }

  public void addToAdjacencyList(Adjacency elem) {
    if (this.adjacencyList == null) {
      this.adjacencyList = new ArrayList<Adjacency>();
    }
    this.adjacencyList.add(elem);
  }

  public List<Adjacency> getAdjacencyList() {
    return this.adjacencyList;
  }

  public void setAdjacencyList(List<Adjacency> adjacencyList) {
    this.adjacencyList = adjacencyList;
  }

  public void unsetAdjacencyList() {
    this.adjacencyList = null;
  }

  /** Returns true if field adjacencyList is set (has been asigned a value) and false otherwise */
  public boolean isSetAdjacencyList() {
    return this.adjacencyList != null;
  }

  public void setAdjacencyListIsSet(boolean value) {
    if (!value) {
      this.adjacencyList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_TYPE:
      if (value == null) {
        unsetNodeType();
      } else {
        setNodeType((NodeType)value);
      }
      break;

    case ROOTS:
      if (value == null) {
        unsetRoots();
      } else {
        setRoots((List<String>)value);
      }
      break;

    case ADJACENCY_LIST:
      if (value == null) {
        unsetAdjacencyList();
      } else {
        setAdjacencyList((List<Adjacency>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_TYPE:
      return getNodeType();

    case ROOTS:
      return getRoots();

    case ADJACENCY_LIST:
      return getAdjacencyList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_TYPE:
      return isSetNodeType();
    case ROOTS:
      return isSetRoots();
    case ADJACENCY_LIST:
      return isSetAdjacencyList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Graph)
      return this.equals((Graph)that);
    return false;
  }

  public boolean equals(Graph that) {
    if (that == null)
      return false;

    boolean this_present_nodeType = true && this.isSetNodeType();
    boolean that_present_nodeType = true && that.isSetNodeType();
    if (this_present_nodeType || that_present_nodeType) {
      if (!(this_present_nodeType && that_present_nodeType))
        return false;
      if (!this.nodeType.equals(that.nodeType))
        return false;
    }

    boolean this_present_roots = true && this.isSetRoots();
    boolean that_present_roots = true && that.isSetRoots();
    if (this_present_roots || that_present_roots) {
      if (!(this_present_roots && that_present_roots))
        return false;
      if (!this.roots.equals(that.roots))
        return false;
    }

    boolean this_present_adjacencyList = true && this.isSetAdjacencyList();
    boolean that_present_adjacencyList = true && that.isSetAdjacencyList();
    if (this_present_adjacencyList || that_present_adjacencyList) {
      if (!(this_present_adjacencyList && that_present_adjacencyList))
        return false;
      if (!this.adjacencyList.equals(that.adjacencyList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Graph other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Graph typedOther = (Graph)other;

    lastComparison = Boolean.valueOf(isSetNodeType()).compareTo(typedOther.isSetNodeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeType()) {
      lastComparison = TBaseHelper.compareTo(this.nodeType, typedOther.nodeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoots()).compareTo(typedOther.isSetRoots());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoots()) {
      lastComparison = TBaseHelper.compareTo(this.roots, typedOther.roots);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdjacencyList()).compareTo(typedOther.isSetAdjacencyList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdjacencyList()) {
      lastComparison = TBaseHelper.compareTo(this.adjacencyList, typedOther.adjacencyList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NODE_TYPE
          if (field.type == TType.I32) {
            this.nodeType = NodeType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ROOTS
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.roots = new ArrayList<String>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                String _elem6;
                _elem6 = iprot.readString();
                this.roots.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ADJACENCY_LIST
          if (field.type == TType.LIST) {
            {
              TList _list7 = iprot.readListBegin();
              this.adjacencyList = new ArrayList<Adjacency>(_list7.size);
              for (int _i8 = 0; _i8 < _list7.size; ++_i8)
              {
                Adjacency _elem9;
                _elem9 = new Adjacency();
                _elem9.read(iprot);
                this.adjacencyList.add(_elem9);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.nodeType != null) {
      oprot.writeFieldBegin(NODE_TYPE_FIELD_DESC);
      oprot.writeI32(this.nodeType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.roots != null) {
      oprot.writeFieldBegin(ROOTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.roots.size()));
        for (String _iter10 : this.roots)
        {
          oprot.writeString(_iter10);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.adjacencyList != null) {
      oprot.writeFieldBegin(ADJACENCY_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.adjacencyList.size()));
        for (Adjacency _iter11 : this.adjacencyList)
        {
          _iter11.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Graph(");
    boolean first = true;

    sb.append("nodeType:");
    if (this.nodeType == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roots:");
    if (this.roots == null) {
      sb.append("null");
    } else {
      sb.append(this.roots);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adjacencyList:");
    if (this.adjacencyList == null) {
      sb.append("null");
    } else {
      sb.append(this.adjacencyList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

