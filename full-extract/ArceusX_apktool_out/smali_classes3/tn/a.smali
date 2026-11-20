.class public Ltn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltn/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltn/a$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ltn/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ltn/a$a;->a(Ltn/a$a;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Ltn/a;->a:Ljava/util/BitSet;

    return-void
.end method

.method public synthetic constructor <init>(Ltn/a$a;Ltn/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltn/a;-><init>(Ltn/a$a;)V

    return-void
.end method

.method public static b()Ltn/a$a;
    .locals 3

    new-instance v0, Ltn/a$a;

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltn/a$a;-><init>(Ljava/util/BitSet;Ltn/b;)V

    return-object v0
.end method


# virtual methods
.method public a(C)Z
    .locals 1

    iget-object v0, p0, Ltn/a;->a:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method public c()Ltn/a$a;
    .locals 3

    new-instance v0, Ltn/a$a;

    iget-object v1, p0, Ltn/a;->a:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltn/a$a;-><init>(Ljava/util/BitSet;Ltn/b;)V

    return-object v0
.end method
