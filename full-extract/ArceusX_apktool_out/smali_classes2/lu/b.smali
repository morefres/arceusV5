.class public final synthetic Llu/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# instance fields
.field public final synthetic a:Llu/e;


# direct methods
.method public synthetic constructor <init>(Llu/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu/b;->a:Llu/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llu/b;->a:Llu/e;

    check-cast p1, Lsu/l;

    invoke-static {v0, p1, p2, p3}, Llu/e;->d(Llu/e;Lsu/l;Ljava/lang/Object;Ljava/lang/Object;)Lyt/n;

    move-result-object p1

    return-object p1
.end method
