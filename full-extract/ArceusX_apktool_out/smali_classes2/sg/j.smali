.class public final synthetic Lsg/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:Lsg/i;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lsg/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/j;->a:Lsg/i;

    iput p2, p0, Lsg/j;->b:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lsg/j;->a:Lsg/i;

    iget v1, p0, Lsg/j;->b:I

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lsg/i$h;->o(Lsg/i;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method
