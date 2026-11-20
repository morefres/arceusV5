.class public final Liv/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Liv/u;

.field public static final c:Liv/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "RoboVM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "Dalvik"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-object v2, Liv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Liv/u$b;

    invoke-direct {v0}, Liv/u$b;-><init>()V

    sput-object v0, Liv/t;->b:Liv/u;

    new-instance v0, Liv/c$a;

    invoke-direct {v0}, Liv/c$a;-><init>()V

    sput-object v0, Liv/t;->c:Liv/c;

    return-void

    :cond_0
    new-instance v0, Liv/a;

    invoke-direct {v0}, Liv/a;-><init>()V

    sput-object v0, Liv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Liv/u$a;

    invoke-direct {v0}, Liv/u$a;-><init>()V

    sput-object v0, Liv/t;->b:Liv/u;

    new-instance v0, Liv/c$a;

    invoke-direct {v0}, Liv/c$a;-><init>()V

    sput-object v0, Liv/t;->c:Liv/c;

    return-void

    :cond_1
    sput-object v2, Liv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Liv/u;

    invoke-direct {v0}, Liv/u;-><init>()V

    sput-object v0, Liv/t;->b:Liv/u;

    new-instance v0, Liv/c;

    invoke-direct {v0}, Liv/c;-><init>()V

    sput-object v0, Liv/t;->c:Liv/c;

    return-void
.end method
