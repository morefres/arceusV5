.class public Lsm/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsm/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Lsm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Lsm/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Lsm/h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsm/d$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lsm/d$b;->b:Ljava/lang/reflect/Field;

    iput-object p3, p0, Lsm/d$b;->c:Lsm/h;

    return-void
.end method


# virtual methods
.method public a(Lsm/m;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsm/d$b;->c:Lsm/h;

    invoke-virtual {v0, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lsm/d$b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lsm/t;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsm/d$b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lsm/d$b;->c:Lsm/h;

    invoke-virtual {v0, p1, p2}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V

    return-void
.end method
