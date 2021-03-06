package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;

@GwtCompatible(emulated=true)
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C>
{
  EmptyContiguousSet(DiscreteDomain<C> paramDiscreteDomain)
  {
    super(paramDiscreteDomain);
  }

  public ImmutableList<C> asList()
  {
    return ImmutableList.of();
  }

  @GwtIncompatible("NavigableSet")
  ImmutableSortedSet<C> createDescendingSet()
  {
    return new EmptyImmutableSortedSet(Ordering.natural().reverse());
  }

  @GwtIncompatible("NavigableSet")
  public UnmodifiableIterator<C> descendingIterator()
  {
    return Iterators.emptyIterator();
  }

  public boolean equals(@Nullable Object paramObject)
  {
    if ((paramObject instanceof Set))
      return ((Set)paramObject).isEmpty();
    return false;
  }

  public C first()
  {
    throw new NoSuchElementException();
  }

  public int hashCode()
  {
    return 0;
  }

  ContiguousSet<C> headSetImpl(C paramC, boolean paramBoolean)
  {
    return this;
  }

  @GwtIncompatible("not used by GWT emulation")
  int indexOf(Object paramObject)
  {
    return -1;
  }

  public ContiguousSet<C> intersection(ContiguousSet<C> paramContiguousSet)
  {
    return this;
  }

  public boolean isEmpty()
  {
    return true;
  }

  boolean isPartialView()
  {
    return false;
  }

  public UnmodifiableIterator<C> iterator()
  {
    return Iterators.emptyIterator();
  }

  public C last()
  {
    throw new NoSuchElementException();
  }

  public Range<C> range()
  {
    throw new NoSuchElementException();
  }

  public Range<C> range(BoundType paramBoundType1, BoundType paramBoundType2)
  {
    throw new NoSuchElementException();
  }

  public int size()
  {
    return 0;
  }

  ContiguousSet<C> subSetImpl(C paramC1, boolean paramBoolean1, C paramC2, boolean paramBoolean2)
  {
    return this;
  }

  ContiguousSet<C> tailSetImpl(C paramC, boolean paramBoolean)
  {
    return this;
  }

  public String toString()
  {
    return "[]";
  }

  @GwtIncompatible("serialization")
  Object writeReplace()
  {
    return new SerializedForm(this.domain, null);
  }

  @GwtIncompatible("serialization")
  private static final class SerializedForm<C extends Comparable>
    implements Serializable
  {
    private static final long serialVersionUID;
    private final DiscreteDomain<C> domain;

    private SerializedForm(DiscreteDomain<C> paramDiscreteDomain)
    {
      this.domain = paramDiscreteDomain;
    }

    private Object readResolve()
    {
      return new EmptyContiguousSet(this.domain);
    }
  }
}

/* Location:           /home/phil/workspace/glass_hello_world/libs/GlassVoice-dex2jar.jar
 * Qualified Name:     com.google.common.collect.EmptyContiguousSet
 * JD-Core Version:    0.6.2
 */