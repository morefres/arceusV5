.class public final synthetic Ltu/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# instance fields
.field public final synthetic a:Ltu/f;


# direct methods
.method public synthetic constructor <init>(Ltu/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltu/b;->a:Ltu/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltu/b;->a:Ltu/f;

    check-cast p1, Lsu/l;

    invoke-static {v0, p1, p2, p3}, Ltu/f;->x(Ltu/f;Lsu/l;Ljava/lang/Object;Ljava/lang/Object;)Lyt/n;

    move-result-object p1

    return-object p1
.end method
