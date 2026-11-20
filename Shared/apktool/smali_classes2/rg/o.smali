.class public final synthetic Lrg/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;


# instance fields
.field public final synthetic c:Lni/m;


# direct methods
.method public synthetic constructor <init>(Lni/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/o;->c:Lni/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lrg/o;->c:Lni/m;

    invoke-virtual {v0, p1}, Lni/m;->g(Ljava/lang/String;)V

    return-void
.end method
